# mc-ping

A Clojure library designed to wrap ServerListPing17 in a Clojure fashion

## Usage

```clojure
(require '[io.dominic.mc-ping :refer [ping]])

(ping {:server "us.mineplex.com"})
(ping {:server "us.mineplex.com" :port 25565}) ;; Port is optional
```

Returns back a [munged](https://github.com/flybe-dev/munge-tout) version of the response.
It essentially looks like the [JSON response](http://wiki.vg/Server_List_Ping#Response)

## License

Copyright © 2015 Dominic Monroe

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
