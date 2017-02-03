# KeyboardAndScrollView
图片或视频View+输入框，使用ScrollView，防止图片或视频View被键盘顶起压缩。

1、AndroidManifest.xml
```
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.tools.test">

    <!-- To auto-complete the email text field in the login form with the user's emails -->
    <uses-permission android:name="android.permission.GET_ACCOUNTS" />
    <uses-permission android:name="android.permission.READ_PROFILE" />
    <uses-permission android:name="android.permission.READ_CONTACTS" />

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:supportsRtl="true"
        android:theme="@style/AppTheme">
        <activity
            android:name="com.liruike.android.activity.LoginActivity"
            android:configChanges="keyboard|orientation|screenSize|layoutDirection"
            android:launchMode="singleTask"
            android:screenOrientation="sensor"
            android:windowSoftInputMode="adjustResize|stateAlwaysHidden" >
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>
```
2、activity_login.xml
```
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent" >
    <ScrollView
        android:layout_height="match_parent"
        android:layout_width="match_parent">
        <LinearLayout
            android:id="@+id/linearLayout1"
            android:layout_width="match_parent"
            android:layout_height="match_parent" >
            <ImageView
                android:layout_width="1080px"
                android:layout_height="1920px"
                android:src="@mipmap/default_start"
                android:scaleType="centerCrop"/>
        </LinearLayout>
    </ScrollView>
    <RelativeLayout
        android:gravity="center"
        android:id="@+id/relativeLayout3"
        android:layout_height="wrap_content"
        android:layout_width="fill_parent"
        android:layout_alignParentBottom="true"
        android:background="#66ffff00">
        <LinearLayout
            android:layout_height="wrap_content"
            android:id="@+id/linearLayout2"
            android:gravity="center_horizontal"
            android:layout_width="fill_parent"
            android:layout_margin="10dip">
            <TextView
                android:id="@+id/textView2"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="用户名：">
            </TextView>
            <EditText
                android:id="@+id/editAccount"
                android:layout_width="250dip"
                android:layout_height="wrap_content"
                android:text="张三">
            </EditText>
        </LinearLayout>
    </RelativeLayout>
</RelativeLayout>
```
