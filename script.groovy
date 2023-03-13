class MyApp {
  def buildApp() {
    println 'Building the application'
  }

  def testApp() {
    println 'Testing the application'
  }

  def deployApp() {
    println 'Deploying the application'
    println "Deploying version ${params.VERSION}"
  }
}

return new MyApp()

