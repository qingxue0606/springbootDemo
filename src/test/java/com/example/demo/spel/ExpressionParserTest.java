package com.example.demo.spel;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * @author xiang
 * @date 2018/12/05
 */
public class ExpressionParserTest {
    ExpressionParser parser;
    @Before
    public void setup() {
        // 初始化创建SpEL表达式解析器
        parser = new SpelExpressionParser();
    }
    @Test
    public void test() {
        // 使用解析器解析出表达式exp
        Expression exp = parser.parseExpression("'Hello World'");
        // 在表达式中获取指定类型的值
        String value = exp.getValue(String.class);
        assertEquals("Hello World", value);
    }
    @Test
    public void test2() {
        // 使用解析器解析出表达式exp
        Expression exp = parser.parseExpression("new Double(3.1415926)");
        // 在表达式中获取指定类型的值
        Double value =exp.getValue(Double.class);
        Double value2=3.1415926;
        assertEquals(value2, value);
    }
    @Test
    public void test3() {
        // 使用解析器解析出表达式exp
        Expression exp = parser.parseExpression("T(java.lang.Math).abs(-1)");
        // 在表达式中获取指定类型的值
        Integer value =exp.getValue(Integer.class);
        Integer value1=1;
        assertEquals(value1, value);
    }
    @Test
    public void test4() {
        StandardEvaluationContext context =new StandardEvaluationContext();
        context.setVariable("message", "Hello World");
        String value =parser.parseExpression("#message").getValue(context, String.class);
        assertEquals("Hello World", value);
    }
    @Test
    public void test5() {
        ExpressionParser parser =new SpelExpressionParser();
        assertEquals(true, parser.parseExpression("35 matches '[0-9]+'").getValue(Boolean.class));
    }
    @Test
    public void test6() {
        ExpressionParser parser =new SpelExpressionParser();
        assertEquals(true, parser.parseExpression("3 between {2,5}").getValue(Boolean.class));
    }

}
