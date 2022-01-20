object Versions {
    //Kotlin
    const val kotlinVersion                     = "1.5.21"
    //SDK
    const val compileSdkVersion                 = 30
    const val buildToolsVersion                 = "30.0.3"
    const val minSdkVersion                     = 23
    const val targetSdkVersion                  = 30

    const val testInstrumentationRunner         = "androidx.test.runner.AndroidJUnitRunner"

    //Android
    const val coreVersion                       = "1.6.0"
    const val appcompatVersion                  = "1.3.1"
    const val activityVersion                   = "1.3.1"
    const val fragmentVersion                   = "1.3.6"

    //Architecture
    const val hiltVersion                       = "2.38.1"
    const val coroutinesVersion                 = "1.5.0"
    const val retrofit2Version                  = "2.9.0"
    const val okhttp3Version                    = "4.9.1"
    const val okHttpJsonMockVersion             = "3.0"
    const val roomVersion                       = "2.3.0"
    const val lifecycleVersion                  = "2.3.1"
    const val chuckerVersion                    = "3.5.0"

    //Business Modules
    const val uikitVersion                      = "2.1.0"
    const val networkVersion                    = "1.0.0"
    const val productsVersion                   = "1.0.0"
    const val homeVersion                       = "1.0.0"
    const val restaurantsVersion                = "1.0.0"
    const val ordersVersion                     = "1.0.0"

    //Views
    const val materialVersion                   = "1.4.0"
    const val recyclerviewVersion               = "1.2.1"
    const val constraintLayoutVersion           = "2.1.0"
    const val glideVersion                      = "4.12.0"

    //Test
    const val jUnitVersion                      = "4.13.2"
    const val androidJUnitVersion               = "1.1.3"
    const val espressoVersion                   = "3.4.0"
    const val testCoreVersion                   = "2.1.0"
    const val truthVersion                      = "1.1.3"
    const val mockitoVersion                    = "2.28.2"
    const val mockitoKotlinVersion              = "4.0.0"

    //Scan
    const val zxingAndroidVersion               = "4.2.0"
    const val zxingCoreVersion                  = "3.4.0"

}

object Deps {

    object Jetpack {
        const val kotlin                        = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlinVersion}"
        const val core                          = "androidx.core:core-ktx:${Versions.coreVersion}"
        const val appcompat                     = "androidx.appcompat:appcompat:${Versions.appcompatVersion}"
        const val activity                      = "androidx.activity:activity-ktx:${Versions.activityVersion}"
        const val fragment                      = "androidx.fragment:fragment-ktx:${Versions.fragmentVersion}"
    }

    object Arch {
        const val coroutinesCore                = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"
        const val coroutinesAndroid             = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
        const val coreHiltAndroid               = "com.google.dagger:hilt-core:${Versions.hiltVersion}"
	const val hiltAndroid                   = "com.google.dagger:hilt-android:${Versions.hiltVersion}"
        const val hiltCompiler                  = "com.google.dagger:hilt-compiler:${Versions.hiltVersion}"
        const val retrofit2                     = "com.squareup.retrofit2:retrofit:${Versions.retrofit2Version}"
        const val gson                          = "com.squareup.retrofit2:converter-gson:${Versions.retrofit2Version}"
        const val loggingInterceptor            = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp3Version}"
        const val okHttpJsonMock                = "com.github.mirrajabi:okhttp-json-mock:${Versions.okHttpJsonMockVersion}"
        const val room                          = "androidx.room:room-ktx:${Versions.roomVersion}"
        const val roomCompiler                  = "androidx.room:room-compiler:${Versions.roomVersion}"
        const val lifecycleViewModel            = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"
        const val lifecycleLiveData             = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"
        const val lifecycleRuntime              = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"    
        const val chucker                       = "com.github.chuckerteam.chucker:library:${Versions.chuckerVersion}"
        const val chuckerNoOp                   = "com.github.chuckerteam.chucker:library-no-op:${Versions.chuckerVersion}"
        const val zxingAndroid                  = "com.journeyapps:zxing-android-embedded:${Versions.zxingAndroidVersion}"
        const val zxingCore                     = "com.google.zxing:core:${Versions.zxingCoreVersion}"
	    
        //Business Modules
        const val products               	= "com.afoxplus.android:products:${Versions.productsVersion}"
        const val network               	= "com.afoxplus.android:network:${Versions.networkVersion}"
        const val home                         	= "com.afoxplus.android:home:${Versions.homeVersion}"
        const val restaurants                   = "com.afoxplus.android:restaurants:${Versions.restaurantsVersion}"
	const val orders                        = "com.afoxplus.android:restaurants:${Versions.ordersVersion}"
    }

    object UI {
        const val uikit                         = "com.afoxplus.android:uikit:${Versions.uikitVersion}"
        const val materialDesign                = "com.google.android.material:material:${Versions.materialVersion}"
        const val constraintLayout              = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
        const val recyclerview                  = "androidx.recyclerview:recyclerview:${Versions.recyclerviewVersion}"
        const val glide                         = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
        const val glideCompiler                 = "com.github.bumptech.glide:compiler:${Versions.glideVersion}"
    }

    object Test {
        const val jUnit                         = "junit:junit:${Versions.jUnitVersion}"
        const val androidJUnit                  = "androidx.test.ext:junit:${Versions.androidJUnitVersion}"
        const val espresso                      = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"
        const val testCore                      = "androidx.arch.core:core-testing:${Versions.testCoreVersion}"
        const val truth                         = "com.google.truth:truth:${Versions.truthVersion}"
        const val mockito                       = "org.mockito:mockito-core:${Versions.mockitoVersion}"
        const val mockitoKotlin                 = "org.mockito.kotlin:mockito-kotlin:${Versions.mockitoKotlinVersion}"
    }
}
