<template>
  <div class="sui-m-card">
    <div class="sui-m-card__content">
      <div class="sui-m-card__category">
        <i class="sui-a-icon as--fa-lightbulb-o as--start"></i>
        {{ feature.category }}
      </div>
      <h3 class="sui-m-card__title">{{ feature.name }}</h3>
      <div class="sui-m-card__details">
        <p>{{ feature.description }}</p>
      </div>
      <div class="sui-m-card__footer">

        <div class="sui-o-grid as--no-wrap as--vertical-center">
          <div class="sui-o-grid__item as--pull-left">
            <i class="sui-a-icon as--start as--fa-dot-circle-o"></i>Score : {{ feature.score }}
          </div>

          <div class="sui-o-grid__item">

          </div>

          <div class="sui-o-grid__item as--pull-right" v-if="!feature.voted">
            <button type="submit" class="sui-a-button as--success" v-on:click="vote({ feature: feature, note: 1 })"><i class="sui-a-icon as--fa-thumbs-up as--start"></i>+1</button>
            <button type="submit" class="sui-a-button as--danger"  v-on:click="vote({ feature: feature, note: -1 })"><i class="sui-a-icon as--fa-thumbs-down as--start"></i>-1</button>
          </div>
        </div>

      </div>
    </div>
  </div>
</template>

<script>
  import { mapActions } from 'vuex';

export default {
  name: 'feature',
  props: ['feature'],
  methods: {
    ...mapActions([
      'vote',
    ]),
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
