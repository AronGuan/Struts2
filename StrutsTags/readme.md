UI标签

通用标签  
1.property   
2.set  
3.bean 实例化pojo类 <s:param>value属性里是OGNL表达式，以后发现有问题&lt; s:debug &gt;看一下就好了。

控制标签
1.if/elseif
2.iterator 其中一个属性status  有count,index,even,odd,first,last常量

\$#%的区别  
1.$用于i18n和struts配置文件
2.#取得ActionContext的值
3.%将原本的文本属性解析为ognl,对于本来就是ognl的属性不起作用
&lt;s:include&gt;