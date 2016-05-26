# My-App-Portfolio

1. app\build.gradle
	minSdkVersion可以适当的低点，可以满足大部分安卓手机版本，参考：https://developer.android.com/about/dashboards/index.html

2. ScrollView是一种特殊的视图，可以根据内容的大小，自动生成垂直滚动条来适应内容；
   ScrollView的使用有些限制，例如她只能有一个子控件，参考：http://javatechig.com/android/android-scrollview-example

3. 控件风格需要统一，尤其是相同控件；values\styles.xml统一存放；

4. 尽量不要硬编码；字符串统一存放在values\strings.xml