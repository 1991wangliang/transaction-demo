package com.example.atomikos.demo;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;
import org.hibernate.TransactionException;
import org.hibernate.engine.transaction.jta.platform.spi.JtaPlatform;
import org.hibernate.engine.transaction.jta.platform.spi.JtaPlatformException;

import javax.transaction.*;

public class AtomikosPlatform  implements JtaPlatform {

    private static final long serialVersionUID = 1L;

    private final TransactionManager txMgr;

    private final UserTransaction userTx;

    public AtomikosPlatform() {
        super();
        this.txMgr = new UserTransactionManager();
        this.userTx = new UserTransactionImp();
    }

    @Override
    public Object getTransactionIdentifier(Transaction transaction) {
        // generally we use the transaction itself.
        return transaction;
    }

    @Override
    public void registerSynchronization(Synchronization synchronization) {
        try {
            this.txMgr.getTransaction()
                    .registerSynchronization(synchronization);
        } catch (Exception e) {
            throw new JtaPlatformException(
                    "Could not access JTA Transaction to register synchronization",
                    e);
        }
    }

    @Override
    public boolean canRegisterSynchronization() {
        try {
            if (this.txMgr.getTransaction() != null) {
                return this.txMgr.getTransaction().getStatus() == Status.STATUS_ACTIVE;
            }
        } catch (SystemException se) {
            throw new TransactionException( "Could not determine transaction status", se );
        }
        return false;
    }

    @Override
    public int getCurrentStatus() throws SystemException {
        return retrieveTransactionManager().getStatus();
    }

    @Override
    public UserTransaction retrieveUserTransaction() {
        return this.userTx;
    }

    @Override
    public TransactionManager retrieveTransactionManager() {
        return this.txMgr;
    }

}
