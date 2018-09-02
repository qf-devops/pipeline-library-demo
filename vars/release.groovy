#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
  echo "Hello, ${name}."
  nexusArtifactUploader(
                   artifacts: [[
                     artifactId: 'simple-maven-project-with-tests',
                     classifier: '',
                     file: '/home/vagrant/jenkins/workspace/test-artifact/target/simple-maven-project-with-tests-1.0-SNAPSHOT.jar',
                     type: 'jar'
                   ]],
                   credentialsId: '',
                   groupId: 'test',
                   nexusUrl: '192.168.33.30:8081/nexus',
                   nexusVersion: 'nexus2',
                   protocol: 'http',
                   repository: 'spring-snapshots',
                   version: '1.0-SNAPSHOT'
                   ) 
}
