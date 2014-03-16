(defproject tailrecursion/boot "1.0.3-SNAPSHOT"
  :description  "A dependency setup/build tool for Clojure."
  :url          "https://github.com/tailrecursion/boot"
  :license      {:name  "Eclipse Public License"
                 :url   "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure       "1.5.1"]
                 [org.flatland/classlojure  "0.7.1" :exclusions [org.clojure/clojure]]
                 [digest                    "1.4.3" :exclusions [org.clojure/clojure]]]
  :aot          :all
  :main         tailrecursion.boot.loader)
