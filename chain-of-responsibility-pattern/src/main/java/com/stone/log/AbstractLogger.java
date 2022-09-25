package com.stone.log;

/**
 * @author Jeff
 * <p>
 * 抽象日志记录器
 */
public abstract class AbstractLogger {

    /* 日志级别：INFO、DEBUG、ERROR */

    public static int INFO = 1;

    public static int DEBUG = 2;

    public static int ERROR = 3;

    protected int level;

    //责任链中的下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    /**
     * 记录日志
     *
     * @param level   日志级别
     * @param message 信息
     */
    public void logMessage(int level, String message) {
        // 记录日志
        if (this.level <= level) {
            write(message);
        }

        // 传递到责任链下一个记录器进行处理
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    /**
     * 记录日志的API
     *
     * @param message 日志信息
     */
    abstract protected void write(String message);

}