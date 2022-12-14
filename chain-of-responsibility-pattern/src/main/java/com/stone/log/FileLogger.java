package com.stone.log;

/**
 * @author Jeff
 * <p>
 * 文件日志记录器
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}