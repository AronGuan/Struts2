ognl表达式

1.注意点 modelDriven  如果没有传参数，那要实例化对象 如：User user = new User().
如果传了参数，框架会帮你实例化，所以不用new,直接定义 User user;

2.ognl是可以访问方法 普通方法:value="XX.XX()",
静态方法:value="@类名@方法名"
静态变量:value="@类名@变量名"
并且要在struts.xml定义常量才行.


3.投影
?#(所有集合)  ^#（集合中的第一个） $#(集合中的最后一个)这三种开头方式