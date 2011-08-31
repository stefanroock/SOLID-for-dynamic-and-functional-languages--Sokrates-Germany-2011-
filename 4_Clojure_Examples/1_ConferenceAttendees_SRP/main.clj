(use 'attendee)
(use 'price_calculator)

(def stefan (make-attendee "Stefan" :participant))
(def markus (make-attendee "Markus" :speaker))
(def andreas (make-attendee "Andreas" :organizer))

(println "Price for regular participant: " (calculate-price stefan))
(println "Price for speaker: " (calculate-price markus))
(println "Price for organizer: " (calculate-price andreas))
