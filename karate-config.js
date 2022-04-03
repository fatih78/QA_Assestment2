function fn() {
    //set up runtime variables based on environment
    //get system property 'karate.env'
    var env = karate.env;

    var config = {
        baseUrl: 'http://localhost:8000/',
        apiKey2: '1234_from_karate-config.js'
    }

    karate.log('karate.env =', karate.env);
    karate.log('config.baseUrl =', config.baseUrl);
    karate.log('config.apiKey =', config.apiKey2);

    return config;
}