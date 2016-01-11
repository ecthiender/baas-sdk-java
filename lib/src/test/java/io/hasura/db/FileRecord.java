package io.hasura.db;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class FileRecord {

    private String filename;
    private String serverPath;
    private Integer id;

    public FileRecord(Integer id, String filename, String serverPath) {
        this.id = id;
        this.filename = filename;
        this.serverPath = serverPath;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
