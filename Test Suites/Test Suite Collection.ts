<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description></description>
   <name>Test Suite Collection</name>
   <tag></tag>
   <delayBetweenInstances>10</delayBetweenInstances>
   <executionMode>PARALLEL</executionMode>
   <maxConcurrentInstances>8</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>true</requireConfigurationData>
            <runConfigurationData>
               <entry>
                  <key>testCloudMobileDevice</key>
                  <value>{
  &quot;capability&quot;: {
    &quot;availability&quot;: &quot;MEDIUM&quot;
  },
  &quot;id&quot;: &quot;apple_iphone_13&quot;,
  &quot;isTablet&quot;: false,
  &quot;manufacturer&quot;: [
    &quot;iPhone&quot;
  ],
  &quot;mobileDeviceId&quot;: &quot;iPhone_13_ios_16&quot;,
  &quot;name&quot;: &quot;iPhone 13&quot;,
  &quot;osVersion&quot;: &quot;16&quot;,
  &quot;os&quot;: &quot;iOS&quot;,
  &quot;platformName&quot;: &quot;IOS&quot;,
  &quot;timeout&quot;: 15,
  &quot;usingTunnel&quot;: false
}</value>
               </entry>
               <entry>
                  <key>testCloudSessionType</key>
                  <value>MOBILE_NATIVE</value>
               </entry>
               <entry>
                  <key>testCloudOverrideMobileApplication</key>
                  <value>{&quot;id&quot;:&quot;6274147c-2b15-489c-94ac-d58a4c37a2a4&quot;,&quot;organizationId&quot;:&quot;134808&quot;,&quot;name&quot;:&quot;Finance&quot;,&quot;platform&quot;:&quot;IOS&quot;,&quot;status&quot;:&quot;READY&quot;,&quot;size&quot;:53242368,&quot;storagePath&quot;:&quot;5d77fa3a-56c0-4a85-a043-40817169a680&quot;,&quot;uploadedDate&quot;:&quot;2024-11-18T12:20:07.496588&quot;,&quot;createdDate&quot;:&quot;2024-11-18T12:20:07.496588&quot;,&quot;updatedDate&quot;:&quot;2024-11-18T12:20:26.545653&quot;,&quot;fileName&quot;:&quot;Finance.ipa&quot;,&quot;metadata&quot;:{&quot;identifier&quot;:&quot;com.uworld.CFA&quot;,&quot;name&quot;:&quot;Finance&quot;,&quot;version&quot;:&quot;2.6&quot;}}</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>TestCloud</runConfigurationId>
         </configuration>
         <runEnabled>false</runEnabled>
         <testSuiteEntity>Test Suites/MCATMobile</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Web Desktop</groupName>
            <profileName>default</profileName>
            <requireConfigurationData>true</requireConfigurationData>
            <runConfigurationData>
               <entry>
                  <key>testCloudMobileDevice</key>
                  <value>{
  &quot;capability&quot;: {
    &quot;availability&quot;: &quot;MEDIUM&quot;
  },
  &quot;id&quot;: &quot;apple_iphone_11_pro&quot;,
  &quot;isTablet&quot;: false,
  &quot;manufacturer&quot;: [
    &quot;iPhone&quot;
  ],
  &quot;mobileDeviceId&quot;: &quot;iPhone_11_Pro_17_real_sjc1&quot;,
  &quot;name&quot;: &quot;iPhone 11 Pro&quot;,
  &quot;osVersion&quot;: &quot;17.7&quot;,
  &quot;os&quot;: &quot;iOS&quot;,
  &quot;platformName&quot;: &quot;IOS&quot;,
  &quot;timeout&quot;: 15,
  &quot;usingTunnel&quot;: false
}</value>
               </entry>
               <entry>
                  <key>testCloudSessionType</key>
                  <value>MOBILE_NATIVE</value>
               </entry>
               <entry>
                  <key>testCloudOverrideMobileApplication</key>
                  <value>{&quot;id&quot;:&quot;07aa662c-4eca-4413-b0b6-1539e147ff56&quot;,&quot;organizationId&quot;:&quot;134808&quot;,&quot;name&quot;:&quot;BOARDS&quot;,&quot;platform&quot;:&quot;IOS&quot;,&quot;status&quot;:&quot;READY&quot;,&quot;size&quot;:53189049,&quot;storagePath&quot;:&quot;4078c197-e9c2-4d4b-8e57-b5ba06f952d2&quot;,&quot;uploadedDate&quot;:&quot;2024-12-09T05:16:20.637555&quot;,&quot;createdDate&quot;:&quot;2024-12-09T05:16:20.637555&quot;,&quot;updatedDate&quot;:&quot;2024-12-09T05:16:28.099237&quot;,&quot;fileName&quot;:&quot;BOARDS-2.ipa&quot;,&quot;metadata&quot;:{&quot;identifier&quot;:&quot;com.uworld.BOARDS&quot;,&quot;name&quot;:&quot;BOARDS&quot;,&quot;version&quot;:&quot;10.0&quot;}}</value>
               </entry>
            </runConfigurationData>
            <runConfigurationId>TestCloud</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/BoardsMobile</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
