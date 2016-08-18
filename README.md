# appium-wechat-demo
## Preparation
###1. Appium APP 安装
	https://bitbucket.org/appium/appium.app/downloads/

###2. Android sdk （下载Android Studio）
	https://developer.android.com/studio/index.html

###3.VirtualBox
	https://www.virtualbox.org/wiki/Downloads

###4. Genymotion
	https://www.genymotion.com/
	先下载Genymotion APP并安装，然后注册并登陆该APP
	登陆后安装"Samsung Galaxy S6 - 5.0.0 - API21 - 1440x2560"虚拟机

###5. maven
	 $ brew install maven
	 $ mvn -v

## Setting
###1. Genymotion Settings
    ADB --> Android SDK

###2. Install ARM_Translation_Lollipop_20160402.ZIP
    Drag it into simiulator


###3. SDK environment variable
    vim .bash_profile
	export ANDROID_HOME=/Users/xxxx/Library/Android/sdk
	export PATH=$ANDROID_HOME/platform-tools:$PATH
	export PATH=$ANDROID_HOME/tools:$PATH
	source ~/.bash_profile
	adb devices

###4. Appium configuration
	Platform version: 5.0.1 Lollipop (API Level 21)
	Advance Andorid SDK path
	Set app path