package netshoes.driverintegration;

public interface ReadWriteTimeoutCallback {
	void callbackTimeout();
	void callbackNextOper();
	void callbackFinish();
}

