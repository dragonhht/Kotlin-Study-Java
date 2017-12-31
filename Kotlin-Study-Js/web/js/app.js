if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'app'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'app'.");
}
var app = function (_, Kotlin) {
  'use strict';
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  function helloWorld() {
    println('Hello World');
  }
  var package$hht = _.hht || (_.hht = {});
  var package$dragonhht = package$hht.dragonhht || (package$hht.dragonhht = {});
  var package$js = package$dragonhht.js || (package$dragonhht.js = {});
  package$js.helloWorld = helloWorld;
  Kotlin.defineModule('app', _);
  return _;
}(typeof app === 'undefined' ? {} : app, kotlin);

//# sourceMappingURL=app.js.map
