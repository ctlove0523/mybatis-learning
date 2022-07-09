package io.github.ctlove0523.mybatis.started.handlers;

public enum FileRating {
    G("G"),
    PG("PG"),
    PG13("PG-13"),
    R("R"),
    NC17("NC-17");

    private String value;

    FileRating(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
