(defproject clj-http-hystrix "0.1.0-SNAPSHOT"

  :description "A Clojure library to wrap clj-http requests as hystrix commands"
  :url "https://github.com/joelittlejohn/clj-http-hystrix"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[clj-http "1.0.0"]
                 [com.netflix.hystrix/hystrix-clj "1.3.18"]
                 [org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [robert/hooke "1.3.0"]]

  :env {:restdriver-port "8081"}

  :profiles {:dev {:dependencies [[midje "1.6.3"]
                                  [org.slf4j/slf4j-simple "1.7.7"]]
                   :plugins [[lein-environ "1.0.0"]
                             [lein-midje "3.1.1"]]
                   :jvm-opts ["-Dhystrix.command.default.execution.isolation.thread.timeoutInMilliseconds=9999"]}})