(defproject lamina "0.4.0"
  :description "event-driven data structures for clojure"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/core.incubator "0.1.0"]
                 [org.clojure/tools.logging "0.2.3"]
                 [org.clojure/math.combinatorics "0.0.2"]
                 [org.clojure/algo.generic "0.1.0"]
                 [potemkin "0.1.0"]]
  ;;:jvm-opts ["-agentlib:jdwp=transport=dt_socket,address=8030,server=y,suspend=n"]
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo})