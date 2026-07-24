<?xml version="1.0" encoding="UTF-8"?>
<MobileElementEntity>
   <description></description>
   <name>dynamic-label-object-starts-with</name>
   <tag></tag>
   <elementGuidId>381feafa-967d-4e27-8e35-4bfc35727836</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <locatorCollection>
      <entry>
         <key>XPATH</key>
         <value>//android.widget.Button[starts-with(@text, '${text}')]</value>
      </entry>
      <entry>
         <key>ANDROID_UI_AUTOMATOR</key>
         <value>new UiSelector()</value>
      </entry>
   </locatorCollection>
   <locatorStrategy>XPATH</locatorStrategy>
   <platform>ANDROID</platform>
</MobileElementEntity>
