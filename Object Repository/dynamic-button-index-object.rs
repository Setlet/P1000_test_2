<?xml version="1.0" encoding="UTF-8"?>
<MobileElementEntity>
   <description></description>
   <name>dynamic-button-index-object</name>
   <tag></tag>
   <elementGuidId>08590ac7-a2e8-4836-8ff9-aac6c830e0a2</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <locatorCollection>
      <entry>
         <key>XPATH</key>
         <value>//android.view.ViewGroup[.//android.widget.TextView[@text='${ref-name}']]//android.widget.Button[@resource-id='com.edata.application.ecrapp:id/${btn-id}'</value>
      </entry>
      <entry>
         <key>ANDROID_UI_AUTOMATOR</key>
         <value>new UiSelector()</value>
      </entry>
   </locatorCollection>
   <locatorStrategy>XPATH</locatorStrategy>
   <platform>ANDROID</platform>
</MobileElementEntity>
