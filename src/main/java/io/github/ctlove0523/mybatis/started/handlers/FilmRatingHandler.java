package io.github.ctlove0523.mybatis.started.handlers;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class FilmRatingHandler extends BaseTypeHandler<FileRating> {
    private Class<FileRating> type;
    private Map<String, FileRating> enums = new HashMap<>();

    public FilmRatingHandler(Class<FileRating> type) {
        this.type = type;

        FileRating[] fileRatings = type.getEnumConstants();
        for (FileRating rating : fileRatings) {
            enums.put(rating.getValue(), rating);
        }
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, FileRating parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.getValue());
    }

    @Override
    public FileRating getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return enums.get(rs.getString(columnName));
    }

    @Override
    public FileRating getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return enums.get(rs.getString(columnIndex));
    }

    @Override
    public FileRating getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return enums.get(cs.getString(columnIndex));
    }
}
