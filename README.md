# nuwaExample
运行master将app\build\outputs`将文件夹下的nuwa文件夹拷贝到一个目录下，我们这里拷贝到C:\nuwa
切换到fixBugBranch进入根目录运行
gradlew clean nuwaDebugPatch -P NuwaDir=C:/nuwa
会在当前工程的app\build\outputs\nuwa\debug目录下生成补丁包patch.jar 
将补丁包copy进手机adb push patch.jar /sdcard/
重启app，可以看到补丁包被正确加载，文本显示变化
