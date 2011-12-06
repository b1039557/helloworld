package helloworld

class MycontrollerController {

    def index = { 
    // this declares a map result
    def result = [:]
   // set a parameter of which will be passed back to the component
	result['name'] = 'umair alam'
	
   //return the map of the properties 
	return result
}
}
