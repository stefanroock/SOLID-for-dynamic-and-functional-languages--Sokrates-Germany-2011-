(defn make-user [id name]
	{:id id, :name name})
		
; Faked save method that should be sufficient for the example.
(defn save-user [user]
	(println "Save user " (:name user) " with ID " (:id user)))
	
; Faked load method that should be sufficient for the example.
(defn load-user [id]
	(println "Load user with ID " id)
	(make-user id (str "User with ID " id)))
