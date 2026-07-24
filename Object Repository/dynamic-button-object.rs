<?xml version="1.0" encoding="UTF-8"?>
<MobileElementEntity>
   <description></description>
   <name>dynamic-button-object</name>
   <tag></tag>
   <elementGuidId>1b7cd166-3d98-45bb-91f6-1f348420747e</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <locatorCollection>
      <entry>
         <key>ANDROID_UI_AUTOMATOR</key>
         <value>new UiSelector()</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//*[@text='${button-name}']/ancestor-or-self::*[@clickable='true'][1]</value>
      </entry>
   </locatorCollection>
   <locatorStrategy>XPATH</locatorStrategy>
   <platform>ANDROID</platform>
</MobileElementEntity>
