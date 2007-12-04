#!/bin/sh
#Copied from http://www.devx.com/Java/Article/28816/1954
#Generate private/public
keytool -genkey -alias privkey -keystore privkeystore -dname "cn=privkey" -storepass foobar
keytool -genkey -alias pubcert -keystore pubcertkeystore -dname "cn=pubcert" -storepass foobar
#Self-Sign private/public
keytool -selfcert -alias privkey -keystore privkeystore -storepass foobar
keytool -selfcert -alias pubcert -keystore pubcertkeystore -storepass foobar
#Export public cert
keytool -export -keystore pubcertkeystore -alias pubcert -storepass foobar -file pubcert
#Import public cert into private store:
keytool -import -alias pubcert -file pubcert -keystore privkeystore -storepass foobar
 