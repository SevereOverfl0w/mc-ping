(ns io.dominic.mc-ping
  (:require [plumbing.core :refer [defnk]]
            [munge-tout.core :refer [from-java]])
  (:import [de.zh32.slp ServerListPing17]
           [java.net InetSocketAddress]))

(defnk ping
  [server {port 25565}]
  (let [slp (ServerListPing17.)]
    (.setAddress slp (InetSocketAddress. server port))
    (from-java (.fetchData slp))))
