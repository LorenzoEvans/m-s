(ns maybe-sheep.articles.article-content
  (:require [maybe-sheep.articles.article-data :refer [how-fp hoon-school-week-1 in-progress]]))

(def content-store
  {:content (array-map
             :how-fp  {:title "How I Ended Up A Functional Programmer"
                       :prev "One night, a little Haskell, and here we are."
                       :url "#/how-fp"
                       :panel-name :how-fp
                       :full-article [how-fp]}
             :how-lisp  {:title "Haskell's list of secrets"
                        :prev "Hold on, wait, you mean like the speech impediment?"
                        :url "#/how-lisp"
                        :panel-name :how-lisp
                        :full-article [in-progress]}
             :hoon-week-1 {:title "Hoon School: Week One" :prev "What the f#&% is thi-...oh my god it's amazing."
                           :url "#/hoon-school-week-1"
                           :panel-name :hoon-week-1
                           :full-article [hoon-school-week-1]}
             :lambda-labs-gql-1 {:title "Lambda Labs & GraphQL, Part I"
                                 :prev "Taught me how to walk this graph, she told me to walk this graph..."
                                 :url "#/lambda-labs-gql-1"
                                 :panel-name :lambda-labs-gql-1
                                 :full-article [in-progress]}
             :lambda-labs-gql-2 {:title "Lambda Labs & Firebase, Part II"
                                 :prev "A quick but vivid journey into the world of O-Auth."
                                 :url "#/lambda-labs-2-firebase"
                                 :panel-name :lambda-labs-gql-2
                                 :full-article [in-progress]}
             :lambda-labs-gql-3 {:title "Lambda Labs & O-Auth Part III"
                                 :prev "A quick but vivid journey into the world of O-Auth, cont."
                                 :url "#lambda-labs-3-firebase"
                                 :panel-name :lambda-labs-gql-3
                                 :full-article [in-progress]}
             :hist-of-linux {:title "An Abridged History of Linux"
                             :prev "How one rebellious Finnish kid redefined an OS."
                             :url "#/hist-of-linux"
                             :panel-name :hist-of-linux
                             :full-article [in-progress]}
             :how-clojure  {:title "How I Ended Up Writing Clojure"
                            :prev "Battened down in web development, one paren left, one way out."
                            :url "#/how-clojure"
                            :panel-name :how-clojure
                            :full-article [in-progress]}
             :how-code {:title "How I Ended Up Writing Code: The Prequel" :prev "spoiler alert: it involves bitcoin"
                        :url "#/how-code-a-prequel"
                        :panel-name :how-code
                        :full-article [in-progress]}
             :functional-fe {:title "My Preferred Front End Set Up" :prev "If you make me write CSS, it's going to be functional!"
                             :url "#/functional-front-end"
                             :panel-name :functional-fe
                             :full-article [in-progress]}
             )})