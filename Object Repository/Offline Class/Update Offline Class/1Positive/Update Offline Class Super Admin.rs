<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Update Offline Class Super Admin</name>
   <tag></tag>
   <elementGuidId>f45d0186-d160-4bfd-836c-b8e4d4ab101c</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;title\&quot;: \&quot;Zumba Internasional Class ${random}\&quot;,\n  \&quot;time\&quot;: \&quot;2012-10-31 15:50:13\&quot;,\n  \&quot;duration\&quot;: 60,\n  \&quot;slot\&quot;: 50,\n  \&quot;price\&quot;: 500000,\n  \&quot;picture\&quot;: \&quot;http://gambar.com/offlineClass/123e4567-e89b-12d3-a456-426614174111.jpg\&quot;,\n  \&quot;trainer_id\&quot;: 1,\n  \&quot;description\&quot;: \&quot;offline class zumba tingkat internasional\&quot;,\n  \&quot;offline_class_category_id\&quot;: 1,\n  \&quot;location\&quot;: \&quot;Alta Gym, Surabaya\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>922d1506-6bb6-45e7-bd88-379e8f1ff01d</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${GlobalVariable.SuperAdminToken}</value>
      <webElementGuid>da4be4ef-2005-4602-8fae-010c48078f10</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>${variable}/offline-classes/details/${ID}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.Globalurl</defaultValue>
      <description></description>
      <id>7444c319-c8e8-4a3a-a2b2-00a649640794</id>
      <masked>false</masked>
      <name>variable</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.ID</defaultValue>
      <description></description>
      <id>fd4e1528-0e5e-4312-80fe-8fbd6ec500e1</id>
      <masked>false</masked>
      <name>ID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.random</defaultValue>
      <description></description>
      <id>e9df8485-7f0b-4000-9a22-417e357bf89f</id>
      <masked>false</masked>
      <name>random</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
