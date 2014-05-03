# hello

$ lein new app hello
made some of this project

try
$ lein deps
$ lein test
$ lein repl

$ lein run -m hello.core Clojure
or
$ lein run Clojure
if ":main hello.core" is in project.clj

$ lein uberjar
if ":aot [hello.core]" is in project.clj
makes java jar

$ java -cp target/hello-0.1.0-standalone.jar hello.core Java
