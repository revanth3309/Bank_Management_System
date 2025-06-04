package bank.management.system;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class LockManager {
    private static final ConcurrentHashMap<String, ReentrantLock> lockMap = new ConcurrentHashMap<>();

    public static ReentrantLock getLock(String pin) {
        lockMap.putIfAbsent(pin, new ReentrantLock());
        return lockMap.get(pin);
    }
}
