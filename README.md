/*
Set up the use of the Robolectric test
*/
- Add the following in build.gradle Module:
  android {
  testOptions {
  unitTests {
  includeAndroidResources = true
  }
  }
  }

   dependencies {
      testImplementation 'org.robolectric:robolectric:4.4'
     }