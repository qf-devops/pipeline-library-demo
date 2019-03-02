#!/usr/bin/env groovy

def call(String name = 'human') {
  
  nexusArtifactUploader(
                   artifacts: [[
                     artifactId: 'spring-app',
                     classifier: '',
                     file: 'spring-app-1.0-SNAPSHOT.jar',
                     type: 'jar'
                   ]],
                   credentialsId: 'admin',
                   groupId: 'com.quickfix.app',
                   nexusUrl: 'http://ec2-18-191-250-128.us-east-2.compute.amazonaws.com:8081/artifactory',
                   nexusVersion: 'nexus2',
                   protocol: 'http',
                   repository: 'snapshots',
                   version: '1.0-SNAPSHOT'
                   ) 
}
