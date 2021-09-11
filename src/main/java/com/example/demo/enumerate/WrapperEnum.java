package com.example.demo.enumerate;

/**
 * @author jns
 * 条件枚举
 */
public enum WrapperEnum {
    ALLEQ("allEq"),
    EQ("eq"),
    NE("ne"),
    GT("GT"),
    GE("ge"),
    LT("lt"),
    LE("le"),
    BETWEEN("between"),
    NOTBETWEEN("notBetween"),
    LIKE("like"),
    NOTLIKE("noLike"),
    LIKELEFT("likeLeft"),
    LIKERIGHT("likeRight"),
    ISNULL("isNull"),
    ISNOTNULL("isNotNull"),
    IN("in"),
    NOTIN("notIn"),
    INSQL("inSql"),
    NOTINSQL("notInSql"),
    GROUPBY("groupBy"),
    ORDERBYASC("orderByAsc"),
    ORDERBYDESC("orderByDesc"),
    ORDERBY("orderBy"),
    HAVING("having"),
    FUNC("func"),
    OR("or"),
    AND("and"),
    NESTED("nested"),
    APPLYY("apply"),
    LAST("last"),
    EXISTS("exists"),
    NOTEXISTS("notExists");

    String conditions;

    WrapperEnum(String conditions) {
        this.conditions = conditions;
    }
}
