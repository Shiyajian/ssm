# 关于全量包和增量包
增量升级的原因是因为实际生产环境中改了很多配置信息，如地址，ip,端口等。
如果全量升级会产生很多问题，导致最后升级失败，进行回滚。

增量升级还存在很多弊端。那就是如果删除了什么文件，这样必须手动检索并删除，不然会产生很多问题。
如果以前文件名小写，改成大写后，多产生2个文件，如果两个文件都存在，如果正好这两个文件都存在spring的注解，那么启动时候会发生异常


解决方法是使用manve.profile功能，提前在配置文件中将各种信息配置好，在打包时候指定的打包环境
这样的话就会生成对应环境的配置文件，全量升级方便。

