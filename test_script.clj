(require '[babashka.pods :as pods])
#_(pods/load-pod ["lein" "run" "-m" "pod.babashka.etaoin"])
(pods/load-pod "./pod-babashka-etaoin")
(require '[pod.babashka.etaoin :as eta])
(def driver (eta/firefox))
(eta/go driver "https://michielborkent.nl")

