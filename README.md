
## Usage

### Step 1

#### Gradle

add jitpack.io

```groovy


allprojects {
    repositories {
        google()
        jcenter()
        maven {
            url "https://jitpack.io"
        }
    }
}
```

add AndroidTools Dependency

[![](https://jitpack.io/v/ShankarKakumani/AndroidTools.svg)](https://jitpack.io/#ShankarKakumani/AndroidTools)

```groovy
dependencies {
    
      implementation 'com.github.ShankarKakumani:AndroidTools:1.0'
}
```

### Step 2 : Usage
 
### 1. Custom Toasts
 
```java
//Success Toast
Toasty.successToast(yourActivity.this, "Your Message");

//Failure Toast
Toasty.failureToast(yourActivity.this, "Your Message");

//Info Toast
Toasty.infoToast(yourActivity.this, "Your Message");

//Error Toast
Toasty.errorToast(yourActivity.this, "Your Message");

//Basic Toast
Toasty.basicToast(yourActivity.this, "Your Message");

//Custom Toast
Toasty.customToast(yourActivity.this, "Your Message", R.drawable.yourIcon, R.color.yourColor);


```        
### 2. StatusBar Color

 ```java
 
 //CustomColor
 StatusBar.setStatusBarColorCustom(yourActivity.this, R.color.yourColor);

//WhiteStatusBar
StatusBar.setStatusBarColorWhite(yourActivity.this);

```   
