package javarepl.expressions;

import java.util.regex.MatchResult;

import static javarepl.expressions.ExpressionPatterns.assignmentWithTypePattern;

public final  class AssignmentWithType extends Expression implements WithKey{
    private final String type;
    private final String key;
    private final String value;

    public AssignmentWithType(String source) {
        super(source);

        MatchResult matches = assignmentWithTypePattern.match(source);
        type = matches.group(1).trim();
        key = matches.group(2).trim();
        value = matches.group(3).trim();
    }

    public String key() {
        return key;
    }

    public String type() {
        return type;
    }

    public String value() {
        return value;
    }
}