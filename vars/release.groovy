#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
  echo "Hello, ${name}."
  nexusArtifactUploader {
        nexusVersion('nexus2')
        protocol('http')
        nexusUrl('192.168.33.30:8081/nexus')
        groupId('test')
        version('1.0-SNAPSHOT')
        repository('spring-snapshots')
        credentialsId('44620c50-1589-4617-a677-7563985e46e1')
        artifact {
            artifactId('simple-maven-project-with-tests')
            type('jar')
           classifier('')
            file('/home/vagrant/jenkins/workspace/test-artifact/target/simple-maven-project-with-tests-1.0-SNAPSHOT.jar')
        }
        
      }
}
