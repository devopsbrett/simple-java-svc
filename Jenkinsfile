#!groovy​
properties([[$class: 'jenkins.model.BuildDiscarderProperty', strategy: [$class              : 'LogRotator',
                                                                        numToKeepStr        : '4',
                                                                        artifactNumToKeepStr: '4']]])

node {
  checkout scm
  def GIT_COMMIT = sh(returnStdout: true, script: 'git rev-parse --short HEAD').trim()

  stage('build') {
    withMaven(maven: 'M3') {
        sh("mvn -Dmaven.tomcat.port=8181 clean install")
    }
  }

  stage('test') {
    withMaven(maven: 'M3') {
      sh("mvn -Dmaven.tomcat.port=8181 verify")
    }
  }
}