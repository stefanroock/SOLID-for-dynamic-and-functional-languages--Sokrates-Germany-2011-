(ns attendee)

(defn make-attendee [name type]
	{:name name, :type type})

(defn make-participant [name]
	(make-attendee name :participant))

(defn make-speaker [name]
	(make-attendee name :speaker))

(defn make-organizer [name]
	(make-attendee name :organizer))
	
