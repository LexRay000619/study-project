## 前后端分立项目模板

包含基本的登录、注册、密码重置等功能,可以二次开发编写具体场景下的应用程序。

* 登录功能 (支持用户名、邮箱登录)
* 注册用户 (通过邮箱注册)
* 重置密码 (通过邮箱重置密码)

登录功能：  
1. 用户登录之后，才能访问index路径下的页面
2. 如果用户没有登录，那么会自动跳转到登录界面
3. 如果用户请求的是一个压根就不存在的界面，依然强制回到登录界面，如果已经登录，那么回到index首页

登录解决方案：  
1. 无论是否已经登录，直接向后端请求用户信息
2. 如果请求成功，那么说明肯定已经登录
3. 如果请求失败，那么说明没有登录，跳转到登录界面

注：需要先开启Redis服务器，才能使用相关功能