/*
* Pipeline for parallel builds
* Version 3.0
* */

job_name = 'regression_testing_staging'
jenkins_job_path = "/var/lib/jenkins/jobs/${job_name}/builds/${BUILD_NUMBER}/htmlreports/"

pipeline {
    agent any

/*
TURN ON or TURN OFF for running of tests at night
 */

    triggers {
        cron('0 01 * * *')
    }

    options {
        buildDiscarder(logRotator(numToKeepStr: '10'))
        disableConcurrentBuilds()
    }

    environment {
        runner1 = 'StagingEnvRunner1'
        runner2 = 'StagingEnvRunner2'
//        runner3 = 'StagingEnvRunner3'
        env_name = 'envStaging.properties'
        MVN_GOAL = 'clean verify'
        CHOICE_SUITE = "-Dit.test="
        DBUS_SESSION_BUS_ADDRESS = "/dev/null"
        EMAIL_INFORM = "a.antonenko@aimprosoft.com, steven.baughan@virtual1.com"
    }
    stages {
        stage('Tests execution') {
            parallel {

                stage('Staging Environment Tests - Thread 1') {
                    when {
                        expression { return env.runner1 != 'None' }
                    }
                    agent any
                    steps {
                        wrap([$class: 'Xvfb', screen: '1920x1080x16', autoDisplayName: true]) {
                            sh "${M2_HOME}/bin/mvn ${env.MVN_GOAL} ${env.CHOICE_SUITE}${env.runner1}"
                        }
                    }
                    post {
                        always {
                            publishHTML(target: [
                                    reportName           : "Report No1(" + env.runner1 + ")",
                                    reportDir            : 'target/site/serenity',
                                    reportFiles          : 'index.html',
                                    keepAll              : true,
                                    alwaysLinkToLastBuild: true,
                                    allowMissing         : false
                            ])
                        }
                    }
                }



                stage('Staging Environment Tests - Thread 2') {
                    when {
                        expression { return env.runner2 != 'None' }
                    }
                    agent any
                    steps {
                        wrap([$class: 'Xvfb', screen: '1920x1080x16', autoDisplayName: true]) {
                            sh "${M2_HOME}/bin/mvn ${env.MVN_GOAL} ${env.CHOICE_SUITE}${env.runner2}"
                        }
                    }
                    post {
                        always {
                            publishHTML(target: [
                                    reportName           : "Report No2(" + env.runner2 + ")",
                                    reportDir            : 'target/site/serenity',
                                    reportFiles          : 'index.html',
                                    keepAll              : true,
                                    alwaysLinkToLastBuild: true,
                                    allowMissing         : false
                            ])
                        }
                    }
                }

//                stage('Staging Environment Tests - Thread 3') {
//                    when {
//                        expression { return env.runner3 != 'None' }
//                    }
//                    agent any
//                    steps {
//                        wrap([$class: 'Xvfb', screen: '1920x1080x16', autoDisplayName: true]) {
//                            sh "${M2_HOME}/bin/mvn ${env.MVN_GOAL} ${env.CHOICE_SUITE}${env.runner3}"
//                        }
//                    }
//                    post {
//                        always {
//                            publishHTML(target: [
//                                    reportName           : "Report No3(" + env.runner3 + ")",
//                                    reportDir            : 'target/site/serenity',
//                                    reportFiles          : 'index.html',
//                                    keepAll              : true,
//                                    alwaysLinkToLastBuild: true,
//                                    allowMissing         : false
//                            ])
//                        }
//                    }
//                }
            }
        }

    }

    post {
//        always {
//
//        }
        success {
            mail bcc: '',
                    body: "<b>Details</b><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL} OR http://jenkinsci.virtual1.net:8080/job/${env.JOB_NAME}/${env.BUILD_NUMBER}/",
                    cc: '',
                    charset: 'UTF-8',
                    from: '',
                    mimeType: 'text/html',
                    replyTo: '',
                    subject: "AUTOMATED TESTS PASSED: Project name -> ${env.JOB_NAME}",
                    to: "${EMAIL_INFORM}";
        }
        failure {
            mail bcc: '',
                    body: "<b>Details</b><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL} OR http://jenkinsci.virtual1.net:8080/job/${env.JOB_NAME}/${env.BUILD_NUMBER}/",
                    cc: '',
                    charset: 'UTF-8',
                    from: '',
                    mimeType: 'text/html',
                    replyTo: '',
                    subject: "AUTOMATED TESTS FAILED: Project name -> ${env.JOB_NAME}",
                    to: "${EMAIL_INFORM}";
        }

    }

}