#!/bin/bash
echo "$(date) - starting..."
docker-compose -f src/docker-compose.yml up --force-recreate -d
echo "$(date) - ready."