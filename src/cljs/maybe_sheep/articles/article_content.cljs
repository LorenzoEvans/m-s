(ns maybe-sheep.articles.article-content)

(def content-store
  {:content (array-map :lambda-labs-gql-1 {:title "Lambda Labs & GraphQL, Part I"
                                           :prev "Taught me how to walk this graph, she told me to walk this graph..."
                                           :url "/lambda-labs-gql-1"
                                           :panel-name :lambda-labs-gql-1}
                       :lambda-labs-gql-2 {:title "Lambda Labs & Firebase, Part II"
                                           :prev "A quick but vivid journey into the world of O-Auth."
                                           :url "/lambda-labs-2-firebase"
                                           :panel-name :lambda-labs-gql-2}
                       :lambda-labs-gql-3 {:title "Lambda Labs & O-Auth Part III"
                                           :prev "A quick but vivid journey into the world of O-Auth."
                                           :url "lambda-labs-3-firebase"
                                           :panel-name :lambda-labs-gql-3}
                       :hist-of-linux {:title "An Abridged History of Linux"
                                       :prev "How one rebellious Finnish kid redefined an OS."
                                       :url "/hist-of-linux"
                                       :panel-name :hist-of-linux}
                       :how-fp  {:title "How I Ended Up A Functional Programmer"
                                 :prev "One night, a little Haskell, and here we are."
                                 :url "/how-fp"
                                 :panel-name :how-fp}
                       :how-lisp  {:title "Haskell's list of secrets"
                                   :prev "Hold on, wait, you mean like the speech impediment?"
                                   :url "/how-lisp"
                                   :panel-name :how-lisp}
                       :how-clojure  {:title "How I Ended Up Writing Clojure"
                                      :prev "Battened down in web development, one paren left, one way out."
                                      :url "/how-clojure"
                                      :panel-name :how-clojure}
                       :how-code {:title "How I Ended Up Writing Code: The Prequel" :prev "spoiler alert: it involves bitcoin"
                                  :url "/how-code-a-prequel"
                                  :panel-name :how-code}
                       :functional-fe {:title "My preferred Front End Set Up" :prev "If you make me write CSS, it's going to be functional!"
                                       :url "/functional-front-end"
                                       :panel-name :functional-fe})})