带参数的结果集
struts.xml通过OGNL表达式${XX}来获取值栈上的值

另外可以看出 只要发出请求，sturts2就会帮你生成ActionContext对象
但是只有Action的情况下，才会生成ValueStack.
