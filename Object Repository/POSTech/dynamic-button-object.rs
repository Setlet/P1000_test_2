<?xml version="1.0" encoding="UTF-8"?>
<MobileElementEntity>
   <description></description>
   <name>dynamic-button-object</name>
   <tag></tag>
   <elementGuidId>e1d0003b-e79f-4691-ac79-a59016d98444</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <locatorCollection>
      <entry>
         <key>XPATH</key>
         <value>//*[@text='${button-name}']/ancestor-or-self::*[@clickable='true'][1]</value>
      </entry>
      <entry>
         <key>ATTRIBUTES</key>
         <value></value>
      </entry>
      <entry>
         <key>ANDROID_UI_AUTOMATOR</key>
         <value>new UiSelector()</value>
      </entry>
   </locatorCollection>
   <locatorStrategy>XPATH</locatorStrategy>
   <platform>ANDROID</platform>
</MobileElementEntity>
