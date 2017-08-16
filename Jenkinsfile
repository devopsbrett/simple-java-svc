#!groovy​
properties([[$class: 'jenkins.model.BuildDiscarderProperty', strategy: [$class              : 'LogRotator',
                                                                        numToKeepStr        : '4',
                                                                        artifactNumToKeepStr: '4']]])

node {
  checkout scm
  def GIT_COMMIT = sh(returnStdout: true, script: 'git rev-parse --short HEAD').trim()

  stage('build') {
    sh("mvn clean install")
  }

  stage('test') {
      sh("mvn verify")
  }
}